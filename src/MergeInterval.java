import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {


    //  Definition for an interval.
      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
     }

     public class Element{
          int val;
          Character ch;
         Element(int val, Character ch) { this.val = val; this.ch = ch; }
     }

     public class MyComaparable implements Comparator<Element>{

         @Override
         public int compare(Element o1, Element o2) {
             return (o1.val - o2.val);
         }
     }

    public List<Interval> merge(List<Interval> intervals) {
          List<Interval> mergeInterval = new ArrayList<>();

          if(intervals==null || intervals.isEmpty() ){
              return mergeInterval;
          }
          List<Element> elements = new ArrayList<>();
        for(Interval interval : intervals){
            Element ele = new Element(interval.start,'s');
            Element end = new Element(interval.end, 'e');

            elements.add(ele);
            elements.add(end);
        }
          //Sort the intervals
          Collections.sort(elements,new MyComaparable());
          int count =0;
          int start =0;
          int end =0;
          int index=0;
          Interval lastInterval =null;
          for(Element element : elements){
              if(element.ch =='s'){
                  if(count==0) {
                      if(lastInterval!=null && lastInterval.end == element.val){
                          mergeInterval.remove(index);
                      }else {
                          start = element.val;
                      }
                  }
                  count++;
              }
              else if(element.ch =='e'){
                  count --;
                  end = element.val;
              }

              if(count==0){
                  Interval interval = new Interval(start,end);
                  lastInterval = interval;
                  mergeInterval.add(interval);
                  index = mergeInterval.size()-1;
              }

          }
        return mergeInterval;
    }
}
