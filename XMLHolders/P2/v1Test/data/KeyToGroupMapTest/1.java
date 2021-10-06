@Test
    public void testGroupCount() {
        KeyToGroupMap m1 = new KeyToGroupMap("Default Group");

        // a new map always has 1 group (the default group)
        assertEquals(1, m1.getGroupCount());

        // if the default group is not mapped to, it should still count towards
        // the group count...
        m1.mapKeyToGroup("C1", "G1");
        assertEquals(2, m1.getGroupCount());

        // now when the default group is mapped to, it shouldn't increase the
        // group count...
        m1.mapKeyToGroup("C2", "Default Group");
        assertEquals(2, m1.getGroupCount());

        // complicate things a little...
        m1.mapKeyToGroup("C3", "Default Group");
        m1.mapKeyToGroup("C4", "G2");
        m1.mapKeyToGroup("C5", "G2");
        m1.mapKeyToGroup("C6", "Default Group");
        assertEquals(3, m1.getGroupCount());

        // now overwrite group "G2"...
        m1.mapKeyToGroup("C4", "G1");
        m1.mapKeyToGroup("C5", "G1");
        assertEquals(2, m1.getGroupCount());
    }

    