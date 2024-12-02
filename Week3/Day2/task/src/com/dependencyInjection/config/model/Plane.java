package com.dependencyInjection.config.model;



import com.dependencyInjection.config.beans.DatabaseOperation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Plane extends Vehicle {

  private DatabaseOperation databaseOperation;
    @Autowired
    public void setDatabaseOperation(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }
}
