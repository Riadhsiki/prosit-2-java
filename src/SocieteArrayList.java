import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion{
    @Override
    @Override
    public void ajouterEmploye(Object o) {
        if (o instanceof Employe) {
            employes.add((Employe) o);gi
            System.out.println("Employe added: " + o);
        } else {
            System.out.println("Invalid object type");
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Object o) {
        if (o instanceof Employe) {
            return employes.contains((Employe) o);
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {
        if (o instanceof Employe) {
            employes.remove((Employe) o);
            System.out.println("Employe removed: " + o);
        } else {
            System.out.println("Invalid object type");
        }
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
        System.out.println("Employees sorted by ID");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, Comparator
                .comparing(Employe::getNom)
                .thenComparing(Employe::getDepartement)
                .thenComparing(Employe::getGrade));
        System.out.println("Employees sorted by Name, Department, and Grade");
    }
}
}
