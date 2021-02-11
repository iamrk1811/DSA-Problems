
import questions.LinkedList.LinkedList;
import questions.LinkedList.Node;
import questions.LinkedList.ReverseLinkedList;
import questions.SearchingAndSorting.CountSubArrayWithSumZero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a, b;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int result = a + b;
        System.out.println(result);

    }
}
