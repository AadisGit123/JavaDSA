package StringsManipulation;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("SNPSU");
        for(int i = 0; i < 10000000; i++){
            sbf.append("Institution");
        }
        System.out.println("Time taken for SBF: " + (System.currentTimeMillis() - startTime) + "ms.");

        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("SNPSU");
        for(int i = 0; i < 10000000; i++){
            sbl.append("Institution");
        }
        System.out.println("Time taken for SBL: " + (System.currentTimeMillis() - startTime) + "ms.");
    }
}
