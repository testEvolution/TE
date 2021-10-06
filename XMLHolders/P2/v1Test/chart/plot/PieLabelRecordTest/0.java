@Test
    public void testEquals() {
        PieLabelRecord p1 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"),
                3.0, 4.0, 5.0);
        PieLabelRecord p2 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"),
                3.0, 4.0, 5.0);
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        p1 = new PieLabelRecord("B", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0);
        assertTrue(p1.equals(p2));

        p1 = new PieLabelRecord("B", 1.1, 2.0, new TextBox("B"), 3.0, 4.0, 5.0);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.1, 2.0, new TextBox("B"), 3.0, 4.0, 5.0);
        assertTrue(p1.equals(p2));

        p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("B"), 3.0, 4.0, 5.0);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("B"), 3.0, 4.0, 5.0);
        assertTrue(p1.equals(p2));

        p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.0, 4.0, 5.0);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.0, 4.0, 5.0);
        assertTrue(p1.equals(p2));

        p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.0, 5.0);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.0, 5.0);
        assertTrue(p1.equals(p2));

        p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.0);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.0);
        assertTrue(p1.equals(p2));

        p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.5);
        assertFalse(p1.equals(p2));
        p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.5);
        assertTrue(p1.equals(p2));

    }

    