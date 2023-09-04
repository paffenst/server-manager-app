package de.paffen.server.manager.app.repo;

import de.paffen.server.manager.app.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server,Long> {
    Server findByIpAddress(String ipAddress);

}
