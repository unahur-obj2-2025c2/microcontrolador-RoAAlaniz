package ar.unahur.edu.obj2.patroncommand.operaciones;
import java.util.ArrayList;
import java.util.List;


import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public class Composite extends Comando {

    List<Operable> operaciones = new ArrayList<>();

    public Composite(List<Operable> operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.run(operaciones);
    }

    protected Boolean noEsCero(Programable micro) {
        return !micro.getAcumuladorA().equals(0);
    }

    public List<Operable> getOperaciones() {
        return operaciones;
    }
}