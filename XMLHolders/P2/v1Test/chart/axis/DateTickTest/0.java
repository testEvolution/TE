@Test
    public void testEquals() {
        Date d1 = new Date(0L);
        Date d2 = new Date(1L);
        String l1 = "Label 1";
        String l2 = "Label 2";
        TextAnchor ta1 = TextAnchor.CENTER;
        TextAnchor ta2 = TextAnchor.BASELINE_LEFT;

        DateTick t1 = new DateTick(d1, l1, ta1, ta1, Math.PI / 2.0);
        DateTick t2 = new DateTick(d1, l1, ta1, ta1, Math.PI / 2.0);
        assertTrue(t1.equals(t2));

        t1 = new DateTick(d2, l1, ta1, ta1, Math.PI / 2.0);
        assertFalse(t1.equals(t2));
        t2 = new DateTick(d2, l1, ta1, ta1, Math.PI / 2.0);
        assertTrue(t1.equals(t2));

        t1 = new DateTick(d1, l2, ta1, ta1, Math.PI / 2.0);
        assertFalse(t1.equals(t2));
        t2 = new DateTick(d1, l2, ta1, ta1, Math.PI / 2.0);
        assertTrue(t1.equals(t2));

        t1 = new DateTick(d1, l1, ta2, ta1, Math.PI / 2.0);
        assertFalse(t1.equals(t2));
        t2 = new DateTick(d1, l1, ta2, ta1, Math.PI / 2.0);
        assertTrue(t1.equals(t2));

        t1 = new DateTick(d1, l1, ta1, ta2, Math.PI / 2.0);
        assertFalse(t1.equals(t2));
        t2 = new DateTick(d1, l1, ta1, ta2, Math.PI / 2.0);
        assertTrue(t1.equals(t2));

        t1 = new DateTick(d1, l1, ta1, ta1, Math.PI / 3.0);
        assertFalse(t1.equals(t2));
        t2 = new DateTick(d1, l1, ta1, ta1, Math.PI / 3.0);
        assertTrue(t1.equals(t2));

        t1 = new DateTick(TickType.MINOR, d1, l1, ta1, ta1, Math.PI);
        t2 = new DateTick(TickType.MAJOR, d1, l1, ta1, ta1, Math.PI);
        assertFalse(t1.equals(t2));
        t2 = new DateTick(TickType.MINOR, d1, l1, ta1, ta1, Math.PI);
        assertTrue(t1.equals(t2));
    }

    