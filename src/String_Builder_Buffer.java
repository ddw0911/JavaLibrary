public class String_Builder_Buffer {
//  StringBuilder와 StringBuffer
//  성능, 동기화를 고려하여 문자열을 다룰 때 사용하는 클래스 (문자열 반복 결합 작업)
//
//  StringBuilder
//  동기화 미지원  - 멀티스레드 환경에서 불안 but 단일스레드에서 빠른성능 (오버헤드x)
//
//  StringBuffer
//  동기화 지원 - 여러 스레드가 접근 가능 (스레드 안정성 확보)
//
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder();
        StringBuffer sbf = new StringBuffer("Hello World");
        //공통 메서드
        // append - 문자열 끝에 value 추가 /w 여러 자료형
        sbd.append("hello");
        // insert - 인덱스에 value 삽입
        sbf.insert(6, "Java");
        // delete - 시작 인덱스부터 끝 인덱스 사이의 문자 제거
        sbf.delete(6, 10);
        // deleteCharAt() - 지정한 위치의 문자 제거
        sbf.deleteCharAt(5);
        // replace - 문자열 대체
        sbd.replace(0, 4, "Good");
        // reverse - 역순으로
        sbd.reverse();
        // toString - String 객체로 변환
        String s = sbd.toString();
        // setLength - 문자열 길이설정(잘라버림 or null로 채움)
        sbf.setLength(15);
        // substring - 인덱스 사이의 문자열 반환
        String str = sbf.substring(5, 10);
        // length - 문자열 길이 반환
        int l = sbd.length();
        // capacity - 객체의 현재 용량 반환 default 16 + 문자열 길이
        int cap = sbd.capacity();
        System.out.println("cap = " + cap);
    }
}
