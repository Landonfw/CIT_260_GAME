/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author animejedifreak
 */
public class MathTrap implements Serializable{
    
    private String equation;
    private int solution;

    public MathTrap() {
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "MathTrap{" + "equation=" + equation + ", solution=" + solution + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.equation);
        hash = 83 * hash + this.solution;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MathTrap other = (MathTrap) obj;
        if (!Objects.equals(this.equation, other.equation)) {
            return false;
        }
        if (this.solution != other.solution) {
            return false;
        }
        return true;
    }
    
    
    
}
