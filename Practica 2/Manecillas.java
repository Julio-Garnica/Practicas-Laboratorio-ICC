public class Manecillas {
    private int manecillaHoras;
    private int manecillaMinutos;
    private int manecillaSegundos;

    public Manecillas (int manecillaHoras, int manecillaMinutos, int manecillaSegundos){
        this.manecillaHoras = manecillaHoras;
        this.manecillaMinutos = manecillaMinutos;
        this.manecillaSegundos = manecillaSegundos;
    }

    public void incrementarSegundos(){
        manecillaSegundos++;
        if (manecillaSegundos >= 60) {
            manecillaSegundos = 0;
            incrementarMinutos();
        }
    }
    
    public void incrementarMinutos(){
        manecillaMinutos++;
        if (manecillaMinutos >= 60) {
            manecillaMinutos = 0;
            incrementarHoras();
        }
    }

    public void incrementarHoras(){
        manecillaHoras++;
        if (manecillaHoras >= 24) {
            manecillaHoras = 0;
        }
    }

    public int getManecillaSegundos(){
        return manecillaSegundos;
    }

    public int getManecillaMinutos(){
        return manecillaMinutos;
    }

    public int getManecillaHoras(){
        return manecillaHoras;
    }
}