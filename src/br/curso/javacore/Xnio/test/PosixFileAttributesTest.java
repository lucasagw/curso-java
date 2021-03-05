package br.curso.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/lucas/dev/arquivo");
        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class); //só pode usar em Linux.
        System.out.println(posix.permissions());
        System.out.println("Alterando as permissões");
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw");
        Files.setPosixFilePermissions(path, permissions);
        posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());

        //continuar da Aula 111: NIO pt 09 DirectoryStream e SimpleFileVisitor

    }
}
