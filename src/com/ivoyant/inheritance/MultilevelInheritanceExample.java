package com.ivoyant.inheritance;

class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team.");
    }
}

class TeamLead extends Manager {
    void lead() {
        System.out.println("Team Lead is leading the project.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead();
        teamLead.work();
        teamLead.manage();
        teamLead.lead();
    }
}