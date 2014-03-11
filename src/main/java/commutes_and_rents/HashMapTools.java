package commutes_and_rents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Methods for manipulating hashmaps.
 * @author andy
 *
 */
public class HashMapTools {

    /**
     * Creates a new HashMap which is the elementwise union of two HashMaps.
     * @param a First contributor to the union
     * @param b Second contributor to the union
     * @return The elementwise union of g and h.
     */
    public static <K, V> HashMap<K, List<V>> Union(HashMap<K, List<V>> a, HashMap<K, List<V>> b)
    {
        Set<K> keys = new HashSet<K>();
        keys.addAll(a.keySet());
        keys.addAll(b.keySet());
        
        HashMap<K, List<V>> result = new HashMap<K, List<V>>();
        for (K key : keys)
        {
            List<V> allValues = Union(a.get(key), b.get(key));
            result.put(key, allValues);
        }
        
        return result;
    }
    
    private static <T> List<T> Union(List<T> a, List<T> b)
    {
        List<T> union = new ArrayList<T>();
        
        if (a != null)
        {
            union.addAll(a);
        }
        
        if (b != null)
        {
            union.addAll(b);
        }
        
        return union;
    }
}
