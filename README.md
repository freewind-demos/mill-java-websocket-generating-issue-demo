Mill Base Project Demo
======================

Install mill:

```
sudo curl -L -o /usr/local/bin/mill https://github.com/lihaoyi/mill/releases/download/0.1.0/0.1.0 && sudo chmod +x /usr/local/bin/mill
```

Run project:

```
mill hello.test
```

Generate IDEA project:

```
mill.scalalib.GenIdeaModule/idea
```

Issue
-----

There is `ivy"org.java-websocket:Java-WebSocket:1.3.7"` in `build.sc`, but when generate IDEA files by `mill mill.scalalib.GenIdeaModule/idea`, the generated library xml file doesn't contain it, see `.idea/libraries/`(they are added to git)