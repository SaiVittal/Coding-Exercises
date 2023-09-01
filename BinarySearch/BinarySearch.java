package BinarySearch;
import java.util.List;

class BinarySearch {

    private List<Integer> list;

    BinarySearch(List<Integer> list) {

        this.list = list;

    }

    int indexOf(Integer search) throws ValueNotFoundException  {

        int start = 0;
        int end = list.size() - 1;

        while (start <= end) {

            int mid = (start + end)/2;
            int midValue = list.get(mid);

            switch (search.compareTo(midValue)) {

                case -1:
                    end = mid - 1;
                    break;
                case 1:
                    start = mid + 1;
                    break;
                default:
                    return mid;

            }

        }
        throw new ValueNotFoundException("Value not in array");

    }
}
