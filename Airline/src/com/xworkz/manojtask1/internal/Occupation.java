package com.xworkz.manojtask1.internal;

public class Occupation {
        private String jobTitle = "Software Engineer";
        private String company = "Tech Corp";
        private double salary = 75000.0;
        private boolean isRemote = true;
        private int experienceYears = 5;

        void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        void setCompany(String company) {
            this.company = company;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        void setRemote(boolean isRemote) {
            this.isRemote = isRemote;
        }

        void setExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
        }

        public void getJobTitle() {
            System.out.println(jobTitle);
        }

        public void getCompany() {
            System.out.println(company);
        }

        public void getSalary() {
            System.out.println(salary);
        }

        public void getRemote() {
            System.out.println(isRemote);
        }

        public void getExperienceYears() {
            System.out.println(experienceYears);
        }
    }


