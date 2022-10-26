package Sort;

import java.util.Arrays;

/**
 * 
 * 
 * @author psurge1
 */
public class Sort
{
    private double[] array;
    public Sort(double ... args)
    {
        array = args;
    }


    /**
     * 
     * @param array
     * @return reversed array
     */
    public static double[] reverse(double[] array)
    {
        double[] reversed = new double[array.length];
        for (int i = 0, n = array.length; i < n; ++i)
        {
            reversed[i] = array[n - i - 1];
        }
        return reversed;
    }

    /**
     * 
     * @return reverse array attribute
     */
    public double[] reverse()
    {
        return reverse(array);
    }


    /**
     * 
     * @param array
     * @return sorted array (linear sort)
     */
    public static double[] linearSort(double[] array)
    {
        int minimum;
        double temp;
        for (int i = 0; i < array.length; ++i)
        {
            minimum = i;
            for (int j = i + 1; j < array.length; ++j)
            {
                minimum = array[j] < array[minimum] ? j : minimum;
            }
            if (minimum != i)
            {
                temp = array[i];
                array[i] = array[minimum];
                array[minimum] = temp;
            }
        }
        return array;
    }

    /**
     * 
     * @return sorted array attribute (linear sort)
     */
    public double[] linearSort()
    {
        return linearSort(array);
    }


    /**
     * 
     * @param array
     * @return sorted array (bubble sort)
     */
    public double[] bubbleSort(double[] array)
    {
        int swapcount;
        double temp;
        do
        {
            swapcount = 0;
            for (int i = 0; i < array.length - 1; ++i)
            {
                if (array[i + 1] < array[i])
                {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    ++swapcount;
                }
            }
        } while (swapcount > 0);
        return array;
    }

    /**
     * 
     * @return sorted array attribute (bubble sort)
     */
    public double[] bubbleSort()
    {
        return bubbleSort(array);
    }


    /**
     * 
     * @param array
     * @return sorted array (merge sort)
     */
    public double[] mergeSort(double[] array)
    {
        if (array.length > 1)
        {
            // left half recursion
            double[] a = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
            // right half recursion
            double[] b = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
            
            int ca = 0, cb = 0;
            double[] r = new double[a.length + b.length];
            while (true)
            {
                if (ca == a.length)
                {
                    r[ca + cb] = b[cb];
                    cb++;
                }
                else if (cb == b.length)
                {
                    r[ca + cb] = a[ca];
                    ca++;
                }
                else if (a[ca] >= b[cb])
                {
                    r[ca + cb] = a[ca];
                    ca++;
                }
                else
                {
                    r[ca + cb] = b[cb];
                    cb++;
                }
                if (ca == a.length && cb == b.length)
                {
                    break;
                }
            }
            return r;
        }
        else
        {
            return array;
        }
    }

    /**
     * 
     * @return sorted array attribute (merge sort)
     */
    public double[] mergeSort()
    {
        return mergeSort(array);
    }

    /**
     * 
     * @param array
     * @return sorted array (quick sort)
     */
    public double[] quickSort(double[] array)
    {
        return array;
    }

    /**
     * 
     * @return sorted array attribute (quick sort)
     */
    public double[] quickSort()
    {
        return quickSort(array);
    }

    /**
     * 
     * @param array
     * @return sorted array (bogo sort)
     */
    public double[] bogoSort(double[] array)
    {
        return array;
    }

    /**
     * 
     * @return sorted array attribute (quick sort)
     */
    public double[] bogoSort()
    {
        return bogoSort(array);
    }


    /**
     * 
     * @return unsorted array attribute
     */
    public double[] getArray()
    {
        return array;
    }

    /**
     * 
     * Set array attribute
     * @param args
     */
    public void setArray(double ... args)
    {
        array = args;
    }
}