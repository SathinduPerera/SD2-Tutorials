import java.util.ArrayList;

public class BubbleSort_w_Objects {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Shunsui Kyoraku", 35));
        people.add(new Person("Sui Feng", 25));
        people.add(new Person("Rōjūrō Ōtoribashi", 28));
        people.add(new Person("Isane Kotetsu", 20));
        people.add(new Person("Shinji Hirako", 30));
        people.add(new Person("Byakuya Kuchiki", 25));
        people.add(new Person("Lisa Yadamaru", 19));
        people.add(new Person("Kensei Muguruama", 29));
        people.add(new Person("Toshiro Hitsugaya", 15));
        people.add(new Person("Kenpachi Zaraki", 33));
        people.add(new Person("Rukia Kuchiki", 18));

        ArrayList<Person> sortedPeopleList = BubbleSort(people);

        System.out.println("""
                -------------------------------------------------------
                                      Unsorted
                -------------------------------------------------------""");
        print(people);
        System.out.println();
        System.out.println("""
                -------------------------------------------------------
                                      Sorted
                -------------------------------------------------------""");
        print(sortedPeopleList);
    }

    public static ArrayList<Person> BubbleSort(ArrayList<Person> arrayList){
        ArrayList<Person> sort_array = (ArrayList<Person>) arrayList.clone();

        int end = sort_array.size() -1;
        Person temp;
        boolean hasSwapped = true;

        while(hasSwapped){
            hasSwapped = false;

            for(int i = 0; i<end; i++){
                if(sort_array.get(i).getAge() > sort_array.get(i+1).getAge()){
                    temp = sort_array.get(i);
                    sort_array.set(i, sort_array.get(i+1));
                    sort_array.set(i+1, temp);
                    hasSwapped = true;
                }
            }
            end--;
        }

        return sort_array;
    }

    public static void print(ArrayList<Person> arr){
        for(Person ppl : arr){
            System.out.println(ppl.toString());
        }
    }


}
