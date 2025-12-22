import java.util.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] basket = new int[N];

    for (int m =0; m <M; m++){
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken()) - 1;
        int j  = Integer.parseInt(st.nextToken()) -1;
        int k = Integer.parseInt(st.nextToken());

//        i번부터 j번까지 k 넣기
        for(int x  =i; x <=j; x++){
            basket[x] = k;
        }
    }

    //출력
    StringBuilder sb = new StringBuilder();
    for(int x=0; x<N; x++){
        sb.append(basket[x]).append("");
    }
    System.out.println(sb);




}


