package com.cgvsu.andreeva_m_n.cg.task_3;

import com.cgvsu.andreeva_m_n.cg.task_3.model.Model;
import com.cgvsu.andreeva_m_n.cg.task_3.objreader.ObjReader;
import com.cgvsu.andreeva_m_n.cg.task_3.objwriter.ObjWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("model1.obj");
        String fileContent = Files.readString(fileName);

        System.out.println("Loading model ...");
        Model model = ObjReader.read(fileContent);

        System.out.println("Vertices: " + model.vertices.size());
        System.out.println("Texture vertices: " + model.textureVertices.size());
        System.out.println("Normals: " + model.normals.size());
        System.out.println("Polygons: " + model.polygons.size());

        ObjWriter.write(model,"result");
    }
}
