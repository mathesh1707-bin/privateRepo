//881. Boats to Save People 
//#Attemp1 - more complex ifs and else ifs
class Solution {
public int numRescueBoats(int[] people, int limit) {
  Arrays.sort(people);
  int n=people.length;
  int i=0;
  int j=n-1;
  int count=0;
  while (i < = j) {
    if (people[j] == limit) {
        j--;
        count++;
    }
    else if (people[i] + people[j] > limit) {
        j--;
        count++;
    }
    else if (people[i] + people[j] < limit) {
        i++;
        j--;
        count++;
    }
    else {
        count++;
        j--;
        i++;
    }
}
    }
}

// #Attemp 2 - Simplified
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int i=0;
        int j=n-1;
        int count=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}
