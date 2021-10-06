@Test
    public void testEquals() {
        FlowArrangement f1 = new FlowArrangement(HorizontalAlignment.LEFT,
                VerticalAlignment.TOP, 1.0, 2.0);
        FlowArrangement f2 = new FlowArrangement(HorizontalAlignment.LEFT,
                VerticalAlignment.TOP, 1.0, 2.0);
        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));

        f1 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.TOP, 1.0, 2.0);
        assertFalse(f1.equals(f2));
        f2 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.TOP, 1.0, 2.0);
        assertTrue(f1.equals(f2));

        f1 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.0, 2.0);
        assertFalse(f1.equals(f2));
        f2 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.0, 2.0);
        assertTrue(f1.equals(f2));

        f1 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.0);
        assertFalse(f1.equals(f2));
        f2 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.0);
        assertTrue(f1.equals(f2));

        f1 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.2);
        assertFalse(f1.equals(f2));
        f2 = new FlowArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.2);
        assertTrue(f1.equals(f2));

    }

    