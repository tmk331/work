## Install

1. Visual Studio Code
3. Git
4. MySQL https://qiita.com/training_zhang/items/5f2fe2da48fb65eece27

## 拡張機能
Visual Studio Codeを以下の拡張機能を追加する。
1. Extension Pack For Java
2. Gradle For Java
3. Language Support for Java(TM) by Red Hat

## Javaプロジェクト作成手順

1. VSCodeを起動
2. 「View」->「Command Palette」から「Create Java Project」を指定
    - 事前に拡張機能「Extension Pack For Java」をインストール
3. ビルドツールとして、Gradleを指定
    - 選択肢：No build tools/Maven/Gradle/Spring Bootなど
    - 事前に拡張機能「Gradle for Java」をインストール
4. Javaプロジェクトを作成するフォルダを指定
    - 事前にフォルダ作成
5. ビルドスクリプトとして、Kotlinを選択
    - 選択肢：GroovyかKotlin
7. プロジェクト名を指定
    - 4で指定したフォルダ名が指定されているので、Enter
8. 「File」->「Open Folder」から作成したフォルダを開く
9. 自動作成されたApp.javaの右クリックから「Run Java」を指定して実行
    - Hello Worldが出力されるはず
    - 必要に応じて名前を変更
11. FizzBuzzについては、FizzBuzz.javaをApp.javaの同階層に作成して完了
12. Webサーバについては、SpringBootWebServer.javaを同階層に作成



