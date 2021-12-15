package com.bl.adp;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    List ContactList = new ArrayList();

    public void add(ContactPerson contactPerson){
        ContactList.add(contactPerson);
    }
}
