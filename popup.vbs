Set objShell = WScript.CreateObject('WScript.Shell')
Set objFSO = CreateObject('Scripting.FileSystemObject')

messages = Array('I\'m watching you...', 'Is anyone there?', 'Don\'t close me!', 'Hello from the PC!')
images = Array('C:\PrankImages\image1.jpg', 'C:\PrankImages\image2.jpg', 'C:\PrankImages\image3.jpg')

Do
    Randomize
    msgIndex = Int((UBound(messages) + 1) * Rnd)
    imgIndex = Int((UBound(images) + 1) * Rnd)

    objShell.Popup messages(msgIndex), 3, 'Surprise!'
    If objFSO.FileExists(images(imgIndex)) Then
        objShell.Run images(imgIndex)
    End If

    WScript.Sleep (60000 * (1 + Int(5 * Rnd()))) ' Wait 1-5 minutes
Loop