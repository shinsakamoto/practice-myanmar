# practice-myanmar

### Myanmar Unicode

http://unicode.org/charts/PDF/U1000.pdf


### Normalization

We need ICU(International Components for Unicode) normalization for correct rendering.

http://site.icu-project.org/

This sample uses icu4j-56_1.jar.

```
String normalizeStr = Normalizer2.getNFDInstance().normalize(text.getText());
```

##### Wrong sorting (SWT rendering)

![image](src/samples/myanmar/swt/doc-files/MMTest_Wrong.png)

##### Normalized (SWT rendering)

![image](src/samples/myanmar/swt/doc-files/MMTest_Normalized.png)

### Prototype Typing Software for Myanmar font

#### SWT with WindowBuilder
![image](src/samples/myanmar/swt/doc-files/MMTypingWithWindowBuilder.png)


-----

### Rendering Testing

#### Rendering on Chrome and Firefox
![image](src/samples/myanmar/test/doc-files/MMTestHTML.png)

#### Rendering on SWT

![image](src/samples/myanmar/test/doc-files/MMTestSwt.png)

#### Rendering on Java FX
![image](src/samples/myanmar/test/doc-files/MMTestFx.png)
#### Rendering on Java FX with WebView
![image](src/samples/myanmar/test/doc-files/MMTestFxWebView.png)
#### Rendering on Swing
![image](src/samples/myanmar/test/doc-files/MMTestSwing.png)

-----

### Others

#### SWT prototype
![image](src/samples/myanmar/swt/doc-files/MMTyping.png)


#### Java FX prototype
![image](src/samples/myanmar/javafx/doc-files/ApplicationMain.png)


-----

### Sample Font problems

#### \u1014\u1031
![image](img/1471402303.png)


#### \u1031\u1014
![image](img/1471402325.png)
