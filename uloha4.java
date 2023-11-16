public class uloha4 {
    static void CtoF(double temp_c) throws Exception {
        if(temp_c < -273.15)
        {
            throw new Exception("zadal si zly vstup pre celzia");
        }
        System.out.println("Stupne farenthaitov je = " + ((9/5) * temp_c + 32));
    }

    static void FtoC(double temp_f) throws Exception {
        if(temp_f < -459.67)
        {
            throw new Exception("zadal si zly vstup pre farenhaity");
        }
        System.out.println("Stupne farenthaitov je = " + ((temp_f - 32) / (9/5)));
    }

    public static void main(String[] args)
    {
        try
        {
            double temp_c = 80;
            double temp_f = -100;
            CtoF(temp_c);
            FtoC(temp_f);
        }
        catch(Exception IllegalArgumentException)
        {
            System.out.println("Exception: " + IllegalArgumentException.getMessage());
        }
    }
}