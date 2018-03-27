public class TriangleType {
    public static boolean checkTamGiacDeu(int canha, int canhb, int canhc){
        if(canha==canhb && canha == canhc)return true;
        else return false;
    }
    public static boolean checkTamGiacCan(int canha, int canhb, int canhc){
        if(canha==canhb || canha == canhc)return true;
        else return false;
    }
    public static boolean checkTriangle(int canha, int canhb, int canhc){
        if(canha+canhb<canhc||canha+canhc<canhc||canhb+canhc<canha){
            return false;
        }else{
            return true;
        }
    }
}