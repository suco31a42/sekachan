class DataType {
    public static void main(String[] args) {
        int month = 12;
        int day = 29;
        float weight = 63.0f; // float型の少数ははfをつける
        double height = 168.5; // double型も少数ははfをつける
        char bloodType = 'A'; // char型の文字は'で囲む
        String name = "テスト"; // そのまま「テスト」の文字列が入るのではなく文字列のアドレスが入る

        System.out.println("こんにちは！" + name + "です。");
        System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
        System.out.println("誕生日は" + month + "月" + day + "日、");
        System.out.println("血液型は" + bloodType + "型です。");
        System.out.println("チャンネル登録や拡散よろしくお願いします！");
    }
}
