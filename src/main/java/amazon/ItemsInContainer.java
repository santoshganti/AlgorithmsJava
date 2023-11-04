package amazon;

//
//import java.util.ArrayList;
//import java.util.Dictionary;
//import java.util.Enumeration;
//import java.util.List;
//
//public class ItemsInContainer {
//    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices)
//    {
//        Dictionary<Long,Long> mapCount = new Dictionary<Long, Long>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public Enumeration<Long> keys() {
//                return null;
//            }
//
//            @Override
//            public Enumeration<Long> elements() {
//                return null;
//            }
//
//            @Override
//            public Long get(Object key) {
//                return null;
//            }
//
//            @Override
//            public Long put(Long key, Long value) {
//                return null;
//            }
//
//            @Override
//            public Long remove(Object key) {
//                return null;
//            }
//        }
//
//        List<Integer> result = new ArrayList<>();
//
//        for(int i =0; i<s.length(); i++)
//        {
//            if(s[i] == '|')
//            {
//                mapCount.put(i + 1, count);
//            }
//            else
//                count++;
//        }
//
//
//        for(int i =0; i< startIndices.Count; i++)
//        {
//            int start = startIndices.ToArray()[i];
//            int end = endIndices.ToArray()[i];
//
//            if(start < end)
//            {
//                int startCount = mapCount.Where(x => x.Key >= start).First().Value;
//                int endCount = mapCount.Where(x => x.Key <= end).Last().Value;
//                result.Add(endCount - startCount);
//                //  Console.WriteLine(endCount - startCount);
//            }
//            else{
//                result.Add(0);
//            }
//
//        }
////        Console.WriteLine($" result len {result.Count}");
//        return result;
//
//    }
//}

public class ItemsInContainer {

}