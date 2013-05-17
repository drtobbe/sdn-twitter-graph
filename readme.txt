#
git log
git status
git commit -a -m "add eclipse files"

git status
git remote -v
git push -u origin master



#branch
git branch
git checkout my-feature-branch
git branch
git commit -a -m "modify file adding hi"
git checkout master
git commit -a -m "add line on hallo.txt"
git merge my-feature-branch
git commit -a -m "resolve merge conflicts"
git checkout my-feature-branch
git checkout master
