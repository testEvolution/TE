@Test
    public void testCloning() {
        PieLabelRecord p1 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"),
                3.0, 4.0, 5.0);
        assertFalse(p1 instanceof Cloneable);
    }

   