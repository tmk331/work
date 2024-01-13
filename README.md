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
13. importのエラーを解消するために、build.gradle.ktsの内容を書き換えて、外部ライブラリを実行可能な状態にする。
    - 事前に拡張機能「Extension Pack For Java」をインストールしていれば、ファイルを保存した際に、
    - 「A build file was modified. Do you want to synchronize the Java classpath/configuration?」というダイアログが表示されるので、YESボタンを押下。
    - 表示されなければ、[Explorer」->「jAVA PROJECTS」->「Rebuild All」からでもエラー解消可能。
14. application.propertiesを追加
15. 事前にインストールしたMySQL WorkbenchからDBサーバを起動して、ddl-test.sqlに書かれたファイルを実行

※Webサーバの問題だけ進めるには、手順13~15の代わりに、手順16~18の設定のほうがよさそう。（MySQLではなく、H2DBを使用）

16. 手順13のbuild.gradleは以下を使用
    - implementation("mysql:mysql-connector-java:8.0.26")をimplementation("com.h2database:h2")に書き換え
17. 手順14のapplication.propertiesの設定は以下を使用
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
18. 手順15は不要。


