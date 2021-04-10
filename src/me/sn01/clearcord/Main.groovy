package me.sn01.clearcord




import org.apache.commons.io.FileUtils


println("   _______..__   __.   ___    __  \n" +
        "    /       ||  \\ |  |  / _ \\  /_ | \n" +
        "   |   (----`|   \\|  | | | | |  | | \n" +
        "    \\   \\    |  . `  | | | | |  | | \n" +
        ".----)   |   |  |\\   | | |_| |  | | \n" +
        "|_______/    |__| \\__|  \\___/   |_| ")


File gpucache = new File(FileUtils.getUserDirectoryPath() + "/AppData/Roaming/discord/GPUCache")
File cache = new File(FileUtils.getUserDirectoryPath() + "/AppData/Roaming/discord/Cache")
File codecache = new File(FileUtils.getUserDirectoryPath() + "/AppData/Roaming/discord/Code Cache")
Thread.sleep(2000)
Runtime rt = Runtime.getRuntime()
rt.exec("taskkill /F /IM Discord.exe")
rt.exec("taskkill /F /IM Update.exe")
Thread.sleep(2000)
FileUtils.deleteDirectory(gpucache)
println("GPU cache cleared")
Thread.sleep(2000)
FileUtils.deleteDirectory(cache)
println("Main cache cleared")
Thread.sleep(2000)
FileUtils.deleteDirectory(codecache)
println("Code cache cleared")
Thread.sleep(2000)
println("PROCESS SUCCESSFUL")
