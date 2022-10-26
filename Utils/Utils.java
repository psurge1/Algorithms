package Utils;


/**
 * 
 * 
 * @author psurge1
 */
public class Utils {
    /**
     * 
     * @param s String array
     * @return double array
     */
    public static double[] stodArr(String[] s)
    {
        double[] k = new double[s.length];
        for (int i = 0; i < s.length; ++i)
            k[i] = Double.valueOf(s[i]);
        return k;
    }


    /**
     * 
     * Prints double array with default seperator " " and default end "\n"
     * @param arr
     */
    public static void arrprint(double[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
    }


    /**
     * 
     * Prints double array with seperator and default end "\n"
     * @param arr
     */
    public static void arrprint(double[] arr, String sep)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + sep);
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
    }


    /**
     * 
     * Prints double array with seperator and end
     * @param arr
     * @param sep
     * @param end
     */
    public static void arrprint(double[] arr, String sep, String end)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + sep);
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print(end);
    }
}