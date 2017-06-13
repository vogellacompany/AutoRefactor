/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2017 Fabrice Tiercelin - Initial API and implementation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program under LICENSE-GNUGPL.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution under LICENSE-ECLIPSE, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.autorefactor.refactoring.rules.samples_out;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Observable;

public class ArrayListRatherThanLinkedListSample {

    public void replaceLinkedListInstanceCreation() {
        // Keep this comment
        boolean isFooContained = new java.util.ArrayList<String>().contains("foo");
        // Keep this comment too
        int size = new java.util.ArrayList<String>(new java.util.ArrayList<String>()).size();
    }

    public void replaceRawLinkedList() {
        // Keep this comment
        Object[] objectArray = new java.util.ArrayList().toArray();
        // Keep this comment too
        int size = new java.util.ArrayList(new java.util.ArrayList<String>()).size();
    }

    public void replaceFullyQualifiedLinkedList() {
        // Keep this comment
        boolean isFooContained = new java.util.ArrayList<Date>().contains("foo");
        // Keep this comment too
        int size = new java.util.ArrayList(new java.util.ArrayList<String>()).size();
    }

    public void replaceLinkedListVariableDeclaration() {
        // Keep this comment
        java.util.ArrayList<LinkedList<String>> list = new java.util.ArrayList<LinkedList<String>>();
    }

    public void doNotReplaceInterface() {
        // Keep this comment
        List<String> list = new LinkedList<String>();
    }

    public void replaceLinkedListVariableUse() {
        // Keep this comment
        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        // Keep this comment too
        list.add("bar");
    }

    public void refactorWithMethod() {
        // Keep this comment
        java.util.ArrayList<Observable> list = new java.util.ArrayList<Observable>();
        // Keep this comment too
        list.toArray();
    }

    public String replaceLinkedListWithLoop(List<Date> dates) {
        // Keep this comment
        java.util.ArrayList<Date> list = new java.util.ArrayList<Date>();
        for (Date date : dates) {
            list.add(date);
        }

        return list.toString();
    }

    public void replaceLinkedListWithModifier() {
        // Keep this comment
        final java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        list.add("bar");
    }

    public void replaceLinkedListWithParameter() {
        // Keep this comment
        java.util.ArrayList<String> list = new java.util.ArrayList<String>(new java.util.ArrayList<String>());
        list.add("bar");
    }

    public boolean replaceReassignedLinkedList() {
        // Keep this comment
        java.util.ArrayList<String> list1 = new java.util.ArrayList<String>();
        list1.add("FOO");

        // Keep this comment too
        java.util.ArrayList<String> list2 = list1;
        list2.add("BAR");

        return list2.isEmpty();
    }

    public void doNotReplaceLinkedListParameter(LinkedList<String> aLinkedList) {
        LinkedList<String> list = aLinkedList;
        list.add("bar");
    }

    public void doNotReplaceLinkedListPassedToAMethod() {
        String text = String.valueOf(new LinkedList<String>());
    }

    public LinkedList<Date> doNotReplaceReturnedLinkedList() {
        return new LinkedList<Date>();
    }

    public void doNotReplaceReassignedVariable() {
        LinkedList<String> list = new LinkedList<String>();
        list = new LinkedList<String>();
    }

    public void doNotReplaceAdd(int index, String element) {
        LinkedList<String> list = new LinkedList<String>();
        list.add(index, element);
    }

    public boolean doNotReplaceAddAll(int index, Collection<String> c) {
        LinkedList<String> list = new LinkedList<String>();
        return list.addAll(index, c);
    }

    public void doNotReplaceAddFirst(String e) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst(e);
    }

    public void doNotReplaceAddLast(String e) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast(e);
    }

    public Iterator<String> doNotReplaceDescendingIterator() {
        LinkedList<String> list = new LinkedList<String>();
        return list.descendingIterator();
    }

    public String doNotReplaceElement() {
        LinkedList<String> list = new LinkedList<String>();
        return list.element();
    }

    public String doNotReplaceGetFirst() {
        LinkedList<String> list = new LinkedList<String>();
        return list.getFirst();
    }

    public String doNotReplaceGetLast() {
        LinkedList<String> list = new LinkedList<String>();
        return list.getLast();
    }

    public ListIterator<String> doNotReplaceListIterator(int index) {
        LinkedList<String> list = new LinkedList<String>();
        return list.listIterator(index);
    }

    public boolean doNotReplaceOffer(String e) {
        LinkedList<String> list = new LinkedList<String>();
        return list.offer(e);
    }

    public boolean doNotReplaceOfferFirst(String e) {
        LinkedList<String> list = new LinkedList<String>();
        return list.offerFirst(e);
    }

    public boolean doNotReplaceOfferLast(String e) {
        LinkedList<String> list = new LinkedList<String>();
        return list.offerLast(e);
    }

    public String doNotReplacePeek() {
        LinkedList<String> list = new LinkedList<String>();
        return list.peek();
    }

    public String doNotReplacePeekFirst() {
        LinkedList<String> list = new LinkedList<String>();
        return list.peekFirst();
    }

    public String doNotReplacePeekLast() {
        LinkedList<String> list = new LinkedList<String>();
        return list.peekLast();
    }

    public String doNotReplacePoll() {
        LinkedList<String> list = new LinkedList<String>();
        return list.poll();
    }

    public String doNotReplacePollFirst() {
        LinkedList<String> list = new LinkedList<String>();
        return list.pollFirst();
    }

    public String doNotReplacePollLast() {
        LinkedList<String> list = new LinkedList<String>();
        return list.pollLast();
    }

    public String doNotReplacePop() {
        LinkedList<String> list = new LinkedList<String>();
        return list.pop();
    }

    public void doNotReplacePush(String e) {
        LinkedList<String> list = new LinkedList<String>();
        list.push(e);
    }

    public String doNotReplaceRemove() {
        LinkedList<String> list = new LinkedList<String>();
        return list.remove();
    }

    public String doNotReplaceRemove(int index) {
        LinkedList<String> list = new LinkedList<String>();
        return list.remove(index);
    }

    public boolean doNotReplaceRemove(Object o) {
        LinkedList<String> list = new LinkedList<String>();
        return list.remove(o);
    }

    public String doNotReplaceRemoveFirst() {
        LinkedList<String> list = new LinkedList<String>();
        return list.removeFirst();
    }

    public boolean doNotReplaceRemoveFirstOccurrence(Object o) {
        LinkedList<String> list = new LinkedList<String>();
        return list.removeFirstOccurrence(o);
    }

    public String doNotReplaceRemoveLast() {
        LinkedList<String> list = new LinkedList<String>();
        return list.removeLast();
    }

    public boolean doNotReplaceRemoveLastOccurrence(Object o) {
        LinkedList<String> list = new LinkedList<String>();
        return list.removeLastOccurrence(o);
    }

    public String doNotReplaceSet(int index, String element) {
        LinkedList<String> list = new LinkedList<String>();
        return list.set(index, element);
    }

    public void replaceListWithRunnable() {
        // Keep this comment
        final java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        new Runnable() {

            @Override
            public void run() {
                final java.util.ArrayList<String> localList = new java.util.ArrayList<String>();
                localList.add("foo");
            }
        };
    }

    public void doNotReplaceField() {
        Comparator<String> c = new Comparator<String>() {

            private boolean doNotRefactorTheExpression = new LinkedList<String>().contains("foo");

            private LinkedList<String> doNotReplaceField = new LinkedList<String>();

            @Override
            public int compare(String arg0, String arg1) {
                return doNotReplaceField.contains(arg0) || !doNotReplaceField.contains(arg0) ? 1 : -1;
            }

        };
    }
}