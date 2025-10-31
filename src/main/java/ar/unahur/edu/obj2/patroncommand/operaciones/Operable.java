package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public interface Operable {
    
    void execute(Programable micro);

    void undo(Programable micro);
}