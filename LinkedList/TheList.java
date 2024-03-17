package MyNewHomeworkUsingGit.LinkedList;

public interface TheList {

    int get(int index);

    int add(int value);
    void add(int value, int index);

    int addLast(int value);
    int addFirst(int value);

    void remove(int index);
    void size();
    void clear();

}
