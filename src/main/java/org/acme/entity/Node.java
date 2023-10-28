package org.acme.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Node extends BaseEntity{

    private ArrayList<String> connections = new ArrayList<>();
    private ArrayList<String> serverQueue = new ArrayList<>();
}
