public class Employe  {
            private int ID;
            private String nom;
            private String prenom;
            private String nomdep;
            private int grade;


            public void setID(int ID) {
                this.ID = ID;
            }

            public void setNom(String nom) {
                this.nom = nom;
            }

            public void setPrenom(String prenom) {
                this.prenom = prenom;
            }

            public void setNomdep(String nomdep) {
                this.nomdep = nomdep;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getPrenom() {
                return prenom;
            }

            public int getID() {
                return ID;
            }

            public String getNom() {
                return nom;
            }

            public String getNomdep() {
                return nomdep;
            }


            public int getGrade() {
                return grade;
            }

            public Employe(int ID, String nom, String prenom, String nomdep, int grade) {
                this.ID = ID;
                this.nom = nom;
                this.prenom = prenom;
                this.nomdep = nomdep;
                this.grade = grade;
            }

            public Employe() {
            }
            @Override
            public String toString(){
                return "Employe{}";
            }
        }
