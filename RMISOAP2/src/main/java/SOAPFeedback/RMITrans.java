package SOAPFeedback;

import java.rmi.Naming;

public class RMITrans {
    KontoI k =(KontoI) Naming.lookup("rmi://localhost:1099/kontotjeneste");
}
