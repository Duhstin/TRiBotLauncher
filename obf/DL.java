package obf;

import java.io.Serializable;
import java.util.ArrayList;

public final class DL implements Serializable
{

    public ArrayList<Aj> A;
    private static final long serialVersionUID = 8230292901933089929L;
    public String a;

    public DL(ArrayList<Aj> a1, String a2)
    {
        A = a1;
        a = a2;
    }
}
