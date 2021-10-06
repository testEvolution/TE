@Test
    public void testEquals() {
        BasicStroke s1 = new BasicStroke(1.0f);
        BasicStroke s2 = new BasicStroke(2.0f);
        CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1",
                1.0, "Category 2", 2.0, Color.RED, s1);
        CategoryLineAnnotation a2 = new CategoryLineAnnotation("Category 1",
                1.0, "Category 2", 2.0, Color.RED, s1);
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        // category 1
        a1.setCategory1("Category A");
        assertFalse(a1.equals(a2));
        a2.setCategory1("Category A");
        assertTrue(a1.equals(a2));

        // value 1
        a1.setValue1(0.15);
        assertFalse(a1.equals(a2));
        a2.setValue1(0.15);
        assertTrue(a1.equals(a2));

        // category 2
        a1.setCategory2("Category B");
        assertFalse(a1.equals(a2));
        a2.setCategory2("Category B");
        assertTrue(a1.equals(a2));

        // value 2
        a1.setValue2(0.25);
        assertFalse(a1.equals(a2));
        a2.setValue2(0.25);
        assertTrue(a1.equals(a2));

        // paint
        a1.setPaint(Color.YELLOW);
        assertFalse(a1.equals(a2));
        a2.setPaint(Color.YELLOW);
        assertTrue(a1.equals(a2));

        // stroke
        a1.setStroke(s2);
        assertFalse(a1.equals(a2));
        a2.setStroke(s2);
        assertTrue(a1.equals(a2));
    }

    