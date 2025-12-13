
// 트리의 순회 결과 반환 

import java.util.ArrayList;
import java.util.List;

public class P25 { 

    // 전위: Root → Left → Right
    public static void preorder(int idx, int[] arr, List<Integer> result) {
        if (idx >= arr.length) return;

        result.add(arr[idx]);               // 1. 현재 노드 방문
        preorder(2 * idx + 1, arr, result); // 2. 왼쪽 서브트리
        preorder(2 * idx + 2, arr, result); // 3. 오른쪽 서브트리
    }

    // 중위: Left → Root → Right
    public static void inorder(int idx, int[] arr, List<Integer> result) {
        if (idx >= arr.length) return;

        inorder(2 * idx + 1, arr, result);   // 1. 왼쪽 서브트리
        result.add(arr[idx]);                // 2. 현재 노드 방문
        inorder(2 * idx + 2, arr, result);   // 3. 오른쪽 서브트리
    }

    // 후위: Left → Right → Root
    public static void postorder(int idx, int[] arr, List<Integer> result) {
        if (idx >= arr.length) return;

        postorder(2 * idx + 1, arr, result); // 1. 왼쪽 서브트리
        postorder(2 * idx + 2, arr, result); // 2. 오른쪽 서브트리
        result.add(arr[idx]);                // 3. 현재 노드 방문
    }


    // 테스트 코드
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> pre  = new ArrayList<>();
        List<Integer> in   = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        preorder(0, arr, pre);
        inorder(0, arr, in);
        postorder(0, arr, post);

        System.out.println("Preorder : " + pre);
        System.out.println("Inorder  : " + in);
        System.out.println("Postorder: " + post);
    }
}