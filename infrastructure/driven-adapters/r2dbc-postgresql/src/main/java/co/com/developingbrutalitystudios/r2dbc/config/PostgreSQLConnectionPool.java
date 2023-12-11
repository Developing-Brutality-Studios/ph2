package co.com.developingbrutalitystudios.r2dbc.config;

import java.time.Duration;
import io.r2dbc.pool.ConnectionPool;
import io.r2dbc.pool.ConnectionPoolConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostgreSQLConnectionPool {
    // TODO: change pool connection properties based on your resources.
    public static final int INITIAL_SIZE = 12;
    public static final int MAX_SIZE = 15;
    public static final int MAX_IDLE_TIME = 30;

	@Bean
	public ConnectionPool getConnectionConfig() {
        // TODO: change these properties for yours
		PostgresqlConnectionProperties pgProperties = new PostgresqlConnectionProperties();
		pgProperties.setDatabase("ph");
		pgProperties.setHost("localhost");
		pgProperties.setPort(5432);
		pgProperties.setUsername("postgres");
		pgProperties.setPassword("postgres");
		pgProperties.setSchema("public");

		return buildConnectionConfiguration(pgProperties);
	}

	private ConnectionPool buildConnectionConfiguration(PostgresqlConnectionProperties properties) {
		PostgresqlConnectionConfiguration dbConfiguration = PostgresqlConnectionConfiguration.builder()
				.host(properties.getHost())
				.port(properties.getPort())
				.database(properties.getDatabase())
				.schema(properties.getSchema())
				.username(properties.getUsername())
				.password(properties.getPassword())
				.build();

        ConnectionPoolConfiguration poolConfiguration = ConnectionPoolConfiguration.builder()
                .connectionFactory(new PostgresqlConnectionFactory(dbConfiguration))
                .name("api-postgres-connection-pool")
                .initialSize(INITIAL_SIZE)
                .maxSize(MAX_SIZE)
                .maxIdleTime(Duration.ofMinutes(MAX_IDLE_TIME))
                .validationQuery("SELECT 1")
                .build();

		return new ConnectionPool(poolConfiguration);
	}
}
