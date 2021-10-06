@Test
    public void testEquals() {
        Comparable c1 = "C1";
        Comparable c2 = "C2";
        TextBlock tb1 = new TextBlock();
        tb1.addLine(new TextLine("Block 1"));
        TextBlock tb2 = new TextBlock();
        tb1.addLine(new TextLine("Block 2"));
        TextBlockAnchor tba1 = TextBlockAnchor.CENTER;
        TextBlockAnchor tba2 = TextBlockAnchor.BOTTOM_CENTER;
        TextAnchor ta1 = TextAnchor.CENTER;
        TextAnchor ta2 = TextAnchor.BASELINE_LEFT;

        CategoryTick t1 = new CategoryTick(c1, tb1, tba1, ta1, 1.0f);
        CategoryTick t2 = new CategoryTick(c1, tb1, tba1, ta1, 1.0f);
        assertTrue(t1.equals(t2));

        t1 = new CategoryTick(c2, tb1, tba1, ta1, 1.0f);
        assertFalse(t1.equals(t2));
        t2 = new CategoryTick(c2, tb1, tba1, ta1, 1.0f);
        assertTrue(t1.equals(t2));

        t1 = new CategoryTick(c2, tb2, tba1, ta1, 1.0f);
        assertFalse(t1.equals(t2));
        t2 = new CategoryTick(c2, tb2, tba1, ta1, 1.0f);
        assertTrue(t1.equals(t2));

        t1 = new CategoryTick(c2, tb2, tba2, ta1, 1.0f);
        assertFalse(t1.equals(t2));
        t2 = new CategoryTick(c2, tb2, tba2, ta1, 1.0f);
        assertTrue(t1.equals(t2));

        t1 = new CategoryTick(c2, tb2, tba2, ta2, 1.0f);
        assertFalse(t1.equals(t2));
        t2 = new CategoryTick(c2, tb2, tba2, ta2, 1.0f);
        assertTrue(t1.equals(t2));

        t1 = new CategoryTick(c2, tb2, tba2, ta2, 2.0f);
        assertFalse(t1.equals(t2));
        t2 = new CategoryTick(c2, tb2, tba2, ta2, 2.0f);
        assertTrue(t1.equals(t2));

    }

    