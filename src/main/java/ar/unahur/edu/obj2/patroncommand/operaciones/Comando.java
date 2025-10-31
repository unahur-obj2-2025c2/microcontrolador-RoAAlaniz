package ar.unahur.edu.obj2.patroncommand.operaciones;
import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public abstract class Comando implements Operable{

    Programable microPrevio;

    @Override
    public void execute(Programable micro) {
        microPrevio = micro.copiar();
        doExecute(micro);
        micro.incProgramCounter(); 
    }

    protected abstract void doExecute(Programable micro);

    @Override
    public void undo(Programable micro){
        micro.copiarDesde(microPrevio);
    }
}