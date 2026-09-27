//217.Contains Duplicate

class Solutin{
  public bool containsDuplicate(int[] arr]{
    Set<Integer> s=new HashSet<>();
    for(int i:arr){
      if(s.contains(i){
         return true;
      }
      s.add(i);
    }
    return false;
  }
}
