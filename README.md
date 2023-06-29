# Workshop

## Description
Workshop 1 introduces the software and documentation required for basic Minecraft modding. During the modding walkthrough, participants will learn how to implement a custom block and item.

<img src=https://github.com/en4395/Workshop_Images/blob/main/Mod_demo/Mushroom_Block.png width=550>
<img src=https://github.com/en4395/Workshop_Images/blob/main/Mod_demo/Star_Wand_Item.png width=550>

## Requirements
This workshop assumes basic java knowledge. For a refresher, see the [Java Introduction page](https://github.com/riri404/Workshop/wiki/Java-Introduction).
### IntelliJ
Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/)
### Java Development Kit
Download and install a [JDK](https://adoptium.net/temurin/releases/)
### Mod Development Kit
Download an [MDK](https://files.minecraftforge.net/net/minecraftforge/forge/). Choose the version corresponding to the Minecraft version you will be modding. Opt for "Download Recommended", choose "Mdk". This part looks sketchy... but is safe!

## Cloning

### Through IntelliJ
1. Copy the repository URL (https://github.com/riri404/Workshop)
2. Open IntelliJ. From the main menu, select "Get from VCS"
3. In the Repository URL tab, paste the URL. Choose a directory for the project
4. Click "Clone"
5. Choose "Trust Project"
6. Wait for "Gradle: build" to complete (this may take several minutes)
   
### Using command line (or Terminal on Mac)
1. Open command line/Terminal
2. Create a directory for the project (either manually, or in the command line using `mkdir <your directory name>` command)
3. Open the project directory using `cd <your directory name>` command
4. Enter `git clone https://github.com/riri404/Workshop` to clone the repository into the open directory
5. Open IntelliJ. From the main menu, select "Open"
6. Locate the mod directory in the file manager window. Select "Open"
7. Choose "Trust Project"
8. Wait for "Gradle: build" to complete (this may take several minutes)
## Build and Run
Once the repository is cloned and the build is complete, the mod is ready to run. 

### Through IntelliJ
1. On the right side of the window, click on the "Gradle" tab
2. Open the <ProjectName> dropdown, click "Tasks", "forgegradleruns"
3. Click on `runClient`
4. Wait for Minecraft to launch


### Using command line (or Terminal on Mac)
1. Open command line/Terminal
2. Open the project directory using `cd <your directory name>` command
3. Enter `./gradlew runClient` (or `gradlew runClient` on Windows)
4. Wait for Minecraft to launch 
## Credits
