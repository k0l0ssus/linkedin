
package com.linkedin.samples.dto;

import java.util.Objects;

/**
 *
 * @author SIGINT-X
 */
public class Dessert {
    
    private String dessertName;
    private long dessertId;
    
    public Dessert(String name, long id){
        this.dessertId = id;
        this.dessertName = name;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public long getDessertId() {
        return dessertId;
    }

    public void setDessertId(long desserId) {
        this.dessertId = desserId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.dessertName);
        hash = 79 * hash + (int) (this.dessertId ^ (this.dessertId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dessert other = (Dessert) obj;
        if (this.dessertId != other.dessertId) {
            return false;
        }
        if (!Objects.equals(this.dessertName, other.dessertName)) {
            return false;
        }
        return true;
    }
    
    
}
