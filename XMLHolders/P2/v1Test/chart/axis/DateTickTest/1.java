@Test
    public void testHashCode() {
        Date d1 = new Date(0L);
        String l1 = "Label 1";
        TextAnchor ta1 = TextAnchor.CENTER;

        DateTick t1 = new DateTick(d1, l1, ta1, ta1, Math.PI / 2.0);
        DateTick t2 = new DateTick(d1, l1, ta1, ta1, Math.PI / 2.0);
        assertTrue(t1.equals(t2));
        int h1 = t1.hashCode();
        int h2 = t2.hashCode();
        assertEquals(h1, h2);
    }

    